import java.util.Date

import com.sfxcode.nosql.mongo.MongoDAO
import com.sfxcode.nosql.mongo.database.DatabaseProvider
import org.bson.codecs.configuration.CodecRegistries._
import org.mongodb.scala.bson.ObjectId
import org.mongodb.scala.bson.codecs.Macros._

/**
 * import mongodb restaurants sample data
 */
object RestaurantDatabase {

  case class Address(street: String, building: String, zipcode: String, coord: List[Double])

  case class Grade(date: Date, grade: String, score: Int)

  case class Restaurant(restaurant_id: String, name: String, borough: String, cuisine: String,
                        grades: List[Grade], address: Address, _id: ObjectId = new ObjectId())

  private val registry = fromProviders(classOf[Restaurant], classOf[Address], classOf[Grade])

  val provider = DatabaseProvider("test", registry)

  object RestaurantDAO extends MongoDAO[Restaurant](provider, "restaurants")

}
package main

import com.sfxcode.nosql.mongo.MongoDAO
import com.sfxcode.nosql

class UserDetails{

  /*val mongoClient: MongoClient = MongoClient("mongodb://localhost/")
  val database: MongoDatabase = mongoClient.getDatabase("main.UserDetails")

  val collection: MongoCollection[UserDetails] =database.getCollection("main.UserDetails");*/

  /*val main.UserDetails = new  Table[UserService]("main.UserDetails"){
    def ID = column[Int]("id")
    def username   = column[String]("username")
    def name = column[String]("name")
    def surname  = column[String]("surname")
    def age = column[Int]("age")

    def * = ID ~ username ~ name ~ surname ~ age <> (UserService.apply _, UserService.unapply _)
  }
  class UserService() {
*/
  def getUSerDetails(username: String){

  }
  def insertUser(username: String, name: String, surname: String, age: Int){


  }
}
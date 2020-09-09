package main

object Demo {
  def main(args: Array[String]) {

    /**Here i create new user service and analyze the requests from postman
     * step 1: get the http request
     * step2: anaylze if it's a GET or POST
     * step2.1: if GET, extract the name
     * step2.2: if POST, get the body and extract information
     * step3: run the function
     *
     * p.s. how about log?
    */
    //the following are examples to see if everything works fine
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);


  }
}

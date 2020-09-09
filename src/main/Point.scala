package main

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("main.Point x location : " + x);
    println("main.Point y location : " + y);
  }
}

package sparktraining

import org.apache.spark.sql.SparkSession

object AppTraining extends App {
//  println("Hello")
    val spark = SparkSession
      .builder()
      .appName("SparkTraining")
      .getOrCreate()

    val df = spark.read.csv(args(0))
    df.show()
}

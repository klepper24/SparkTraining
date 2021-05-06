package sparktraining

import org.apache.spark.sql.SparkSession

object AppTraining extends App {
//  println("Hello")
    val spark = SparkSession
      .builder()
      .master("local")
      .appName("SparkTraining")
      .getOrCreate()

    val df = spark.read.csv("C:\\SparkTraining\\gender_submission.csv")
    df.show()
}

package com.softwarepassion.snn

import org.scalatest.FunSuite
import breeze.linalg._

class NeuralNetworkTest extends FunSuite {

  test("testTrain") {
    val nn: NeuralNetwork = new NeuralNetwork()
    val allData: DenseMatrix[Double] = DataLoader.loadDataFromCsv("/Users/kris/Projects/snn/example_data/Kaggle_Digits_1000.csv")
    val data: DenseMatrix[Double] = allData(::, 1 to allData.cols - 1)
    val labels: DenseVector[Double] = allData(::, 0)
    nn.train(data, labels)
  }

}

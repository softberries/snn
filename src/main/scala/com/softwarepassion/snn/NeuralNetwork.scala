package com.softwarepassion.snn

import breeze.linalg._

class NeuralNetwork {

  def train(data: DenseMatrix[Double], labels: DenseVector[Double]) = {
    println("Data: " + data.rows + " X " + data.cols)
    println("Labels: " + labels.size)
  }

}

package com.softwarepassion.snn

import java.io.File

import breeze.linalg._

object DataLoader {

  def loadDataFromCsv(filePath: String): DenseMatrix[Double] = {
    /*
    file: File,
             separator: Char=',',
             quote: Char='"',
             escape: Char='\\',
             skipLines: Int = 0
     */
    breeze.linalg.csvread(file = new File(filePath), skipLines = 1)
  }

}

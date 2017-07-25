package com.mizu

import com.amazonaws.services.lambda.runtime.Context
import com.mizu.MizuHandler.Response
//import com.amazonaws.services.lambda.runtime.LambdaLogger
import com.amazonaws.services.lambda.runtime.RequestHandler
import scala.beans.BeanProperty

object MizuHandler {

  case class Response(@BeanProperty body: String = "", @BeanProperty headers: String = "", @BeanProperty statusCode: Int = 200)

}

class MizuHandler extends RequestHandler[java.lang.Object, MizuHandler.Response] {
  override def handleRequest(input: Object, context: Context): MizuHandler.Response = {
    val res: String =
      s"""
         | input.toString
         | $input
         |
         | context
         | $context
         |""".stripMargin
    MizuHandler.Response(res)
  }
}

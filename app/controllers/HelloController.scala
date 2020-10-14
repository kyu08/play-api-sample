package controllers

import javax.inject.Inject
import play.api.mvc._

class HelloController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def hello(): Action[AnyContent] = Action(Ok)
}
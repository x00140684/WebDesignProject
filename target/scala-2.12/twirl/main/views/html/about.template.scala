
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("About")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<!-- PAGE CONTENT BY DAWID RESZKA X00140684!-->
<div class="row">
  <div class="col-sm-12" style="text-align:center; margin-bottom:2em;">
        
          <img src=""""),_display_(/*8.22*/routes/*8.28*/.Assets.versioned("images/meet.jpg")),format.raw/*8.64*/("""" alt="Los Angeles" style="width:100%; border-bottom: 3px; border-bottom-style: solid;
      border-bottom-color:#5b9aff;" >
  
  </div>
  <div class="info" style="border:1px solid #ccc; text-align:center;">
  <h1>Welcome to Gear Foot - About Us</h1>
  <p>Hi! Gear Foot is a website created by a team of 3 people</p>
  
  
  <p>Justinas Zavelskis - Programmer</p>
  <p>Dawid Reszka - Graphic Designer</p>
  <p>Mohammad Luqman Shezhad - Manager</p>
  </br>
  <p>The main goal of our website is to create a market for car enthusiast who are in-need of a market/platform to sell their unique , modified , stock and classic vehicles.</br>
  - Click <a href="cars.html">here</a> to see cars we have for sale.</br>
  In addition, our website is also a platform where you can sell and buy car parts that some may need.</br>
  - Click <a href="parts.html">here</a> to see parts we have for sale</p>
  
  <p>However, our website is also a place where you can meet new people and car enthusiast. This information can be found in our <a href="getinvolved.html">Get Involved</a> page where you can find farious of information about many car meets all around the world!</p>
  
  </ul>
  </div>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 22 22:34:25 GMT 2017
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/about.scala.html
                  HASH: b30392447b90637a8100a63402fe40e16c21c4b7
                  MATRIX: 941->1|1037->3|1065->6|1086->19|1125->21|1154->24|1348->192|1362->198|1418->234|2630->1416
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|40->8|40->8|40->8|62->30
                  -- GENERATED --
              */
          
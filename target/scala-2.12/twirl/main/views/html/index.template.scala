
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- Dawid Reszka -->
"""),_display_(/*3.2*/main("Index")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<style>
     
    .row """),format.raw/*6.10*/("""{"""),format.raw/*6.11*/("""
    """),format.raw/*7.5*/("""background-color:#f2f2f2;
    text-align: center;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""p"""),format.raw/*10.4*/("""{"""),format.raw/*10.5*/("""	"""),format.raw/*10.6*/("""letter-spacing: 1px;
  line-height: 1.2;
   word-spacing: 2px;
  text-indent: 50px;
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""
    
  """),format.raw/*16.3*/("""</style>
  <div class="row">
      <div class="col-sm-12" style="text-align:center; margin-bottom:2em;">
            
              <img src=""""),_display_(/*20.26*/routes/*20.32*/.Assets.versioned("images/meet.jpg")),format.raw/*20.68*/("""" alt="Los Angeles" style="width:100%; border-bottom: 3px; border-bottom-style: solid;
          border-bottom-color:#5b9aff;" >
      
      </div>
      <div class="info" style="border:1px solid #ccc;">
      <h1>Welcome to Gear Foot</h1>
      Smokin' exhaust fumes since 2015. 
      <br/>Showcasing the fastest, coolest, most insane vehicles on the planet!
      <br/>Our website is dedicated to giving you the latest information about the car community here in Ireland.
      <br/>If you're a car enthusiast then this site is made for you,
      our website will show you cars, parts and how to get involved within the community.
      <br/>If you are not yet a car enthusiast, we strongly encourage you to join our community and learn the work of art that is cars. Become a member today and register on our website to learn more.</p>
      </div>
      <div class="col-sm-6" style="display:flex;justify-content:center;align-items:center;">
      <div class="container"style="width:60%;">
        <h2>Featured Cars</h2>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
          <!-- Indicators -->
          <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
          </ol>
      
          <!-- Wrapper for slides -->
          <div class="carousel-inner">
      
            <div class="item active">
              <img src=""""),_display_(/*48.26*/routes/*48.32*/.Assets.versioned("images/wrx.jpg")),format.raw/*48.67*/("""" alt="Los Angeles" style="width:100%;height: 300px;">
              <div class="carousel-caption">
                <h3>Subaru Impreza WRX</h3>
                
              </div>
            </div>
      
            <div class="item">
              <img src=""""),_display_(/*56.26*/routes/*56.32*/.Assets.versioned("images/silvia.jpg")),format.raw/*56.70*/("""" alt="Chicago" style="width:100%;height: 300px;">
              <div class="carousel-caption">
                <h3>Nissan Silvia</h3>
                
              </div>
            </div>
          
            <div class="item">
              <img src=""""),_display_(/*64.26*/routes/*64.32*/.Assets.versioned("images/240sx.jpg")),format.raw/*64.69*/("""" alt="New York" style="width:100%;height: 300px;">
              <div class="carousel-caption">
                <h3>Nissan 240sx</h3>
                
              </div>
            </div>
        
          </div>
      
          <!-- Left and right controls -->
          <a class="left carousel-control" href="#myCarousel" data-slide="prev"style="color:#5b9aff;">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="right carousel-control" href="#myCarousel" data-slide="next"style="color:#5b9aff;">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
      </div>
      </div>
      
      
      
      
      
      
      
      
      <div class="col-sm-6" style="display:flex;justify-content:center;align-items:center;">
      <div class="container"style="width:60%;">
        <h2>Featured Parts</h2>
        <div id="myCarousel2" class="carousel slide" data-ride="carousel">
          <!-- Indicators -->
          <ol class="carousel-indicators">
            <li data-target="#myCarousel2" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel2" data-slide-to="1"></li>
            <li data-target="#myCarousel2" data-slide-to="2"></li>
          </ol>
      
          <!-- Wrapper for slides -->
          <div class="carousel-inner">
      
            <div class="item active">
              <img src=""""),_display_(/*108.26*/routes/*108.32*/.Assets.versioned("images/toyo.jpg")),format.raw/*108.68*/("""" alt="Toyo" style="width:100%;height: 300px;">
              <div class="carousel-caption">
                <h3>Grip Performance Toyo Tires</h3>
                
              </div>
            </div>
      
            <div class="item">
              <img src=""""),_display_(/*116.26*/routes/*116.32*/.Assets.versioned("images/GT.jpg")),format.raw/*116.66*/("""" alt="GT" style="width:100%;height: 300px;">
              <div class="carousel-caption">
                <h3>GT Spoiler</h3>
                
              </div>
            </div>
          
            <div class="item">
              <img src=""""),_display_(/*124.26*/routes/*124.32*/.Assets.versioned("images/ssr.png")),format.raw/*124.67*/("""" alt="SSR" style="width:100%; height: 300px;">
              <div class="carousel-caption">
                
            <h3>SSR Original Wheels</h3>
                
              </div>
            </div>
        
          </div>
      
          <!-- Left and right controls -->
          <a class="left carousel-control" href="#myCarousel2" data-slide="prev" style="color:#5b9aff;">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="right carousel-control" href="#myCarousel2" data-slide="next" style="color:#5b9aff;" >
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
      </div>
      </div>
      </div>
""")))}),format.raw/*147.2*/("""
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
                  DATE: Fri Dec 22 17:53:39 GMT 2017
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/index.scala.html
                  HASH: 7480fa56f21077a2bada68722f2a4daad4f4c450
                  MATRIX: 941->1|1037->3|1064->4|1112->27|1133->40|1172->42|1201->45|1251->68|1279->69|1310->74|1390->128|1417->129|1447->132|1475->133|1503->134|1531->135|1644->221|1672->222|1707->230|1877->373|1892->379|1949->415|3532->1971|3547->1977|3603->2012|3894->2276|3909->2282|3968->2320|4254->2579|4269->2585|4327->2622|5895->4162|5911->4168|5969->4204|6263->4470|6279->4476|6335->4510|6614->4761|6630->4767|6687->4802|7530->5614
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|38->6|38->6|39->7|41->9|41->9|42->10|42->10|42->10|42->10|46->14|46->14|48->16|52->20|52->20|52->20|80->48|80->48|80->48|88->56|88->56|88->56|96->64|96->64|96->64|140->108|140->108|140->108|148->116|148->116|148->116|156->124|156->124|156->124|179->147
                  -- GENERATED --
              */
          
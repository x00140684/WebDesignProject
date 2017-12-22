
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""
"""),format.raw/*8.1*/("""<!-- Dawid Reszka -->
<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>Gear Foot - """),_display_(/*13.29*/title),format.raw/*13.34*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
              """),format.raw/*22.15*/("""margin-bottom: 0;
              border-radius: 0;
              background-color: #232323;"""),format.raw/*24.41*/("""}"""),format.raw/*24.42*/("""
            
            """),format.raw/*26.13*/("""/* Add a gray background color and some padding to the footer */
        
            footer """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
              """),format.raw/*29.15*/("""background-color: #232323;
              padding: 10px;
              margin-top: 100px;
              border-top: 3px;
              border-top-color:#5b9aff;
              border-top-style:solid;
              color: #f2f2f2;
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""
        
            """),format.raw/*38.13*/(""".dropdown-menu """),format.raw/*38.28*/("""{"""),format.raw/*38.29*/("""
            """),format.raw/*39.13*/("""border-bottom:3px;
            border-bottom-color:#5b9aff;
            border-bottom-style: solid;
            color:light-gray;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
        """),format.raw/*44.9*/("""</style>
    </head>
    <body>
            <nav class="navbar navbar-inverse"style="border-bottom: 3px; border-bottom-style: solid;
            border-bottom-color:#5b9aff;">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>                        
          </button>
          <a class="navbar-brand" href="/">Gear Foot</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav">
            <li """),_display_(/*60.18*/if(title == "Index")/*60.38*/{_display_(Seq[Any](format.raw/*60.39*/("""class="active"""")))}),format.raw/*60.54*/(""" """),format.raw/*60.55*/("""><a href="/">Home</a></li>
            <li """),_display_(/*61.18*/if(title == "Cars" || title == "Parts")/*61.57*/{_display_(Seq[Any](format.raw/*61.58*/("""class="active"""")))}),format.raw/*61.73*/("""class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown">Store
            <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="cars">Cars</a></li>
              <li><a href="parts">Parts</a></li>
             
            </ul>
          </li>
            <li """),_display_(/*70.18*/if(title == "Getinvolved")/*70.44*/{_display_(Seq[Any](format.raw/*70.45*/("""class="active"""")))}),format.raw/*70.60*/("""><a href="getinvolved">Get Involved</a></li>
            <li """),_display_(/*71.18*/if(title == "Contact")/*71.40*/{_display_(Seq[Any](format.raw/*71.41*/("""class="active"""")))}),format.raw/*71.56*/("""><a href="contact">Contact</a></li>
            <li """),_display_(/*72.18*/if(title == "About")/*72.38*/{_display_(Seq[Any](format.raw/*72.39*/("""class="active"""")))}),format.raw/*72.54*/("""><a href="about">About</a></li>
            <li """),_display_(/*73.18*/if(title == "Basket")/*73.39*/{_display_(Seq[Any](format.raw/*73.40*/("""class="active"""")))}),format.raw/*73.55*/("""><a href="basket">Cart</a></li>
          </ul>
          
          <ul class="nav navbar-nav navbar-right">
            <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            <li><a href="register"><span class="glyphicon glyphicon-log-in"></span> Register</a></li>
          </ul>
        </div>
      </div>
    </nav>
        """),format.raw/*84.32*/("""
        """),_display_(/*85.10*/content),format.raw/*85.17*/("""
        """),format.raw/*86.9*/("""<footer class="container-fluid text-center">
                <p>©Copyright All Rights Reserved</p>
              </footer>
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("javascripts/main.js")),format.raw/*89.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 22 17:53:39 GMT 2017
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/main.scala.html
                  HASH: 7f66a9b0d5592043da5a7192560154c68f039230
                  MATRIX: 1206->260|1331->290|1358->291|1460->418|1496->427|1543->447|1569->452|2137->992|2166->993|2209->1008|2327->1098|2356->1099|2410->1125|2531->1218|2560->1219|2603->1234|2871->1474|2900->1475|2950->1497|2993->1512|3022->1513|3063->1526|3233->1668|3262->1669|3298->1678|4036->2389|4065->2409|4104->2410|4150->2425|4179->2426|4250->2470|4298->2509|4337->2510|4383->2525|4740->2855|4775->2881|4814->2882|4860->2897|4949->2959|4980->2981|5019->2982|5065->2997|5145->3050|5174->3070|5213->3071|5259->3086|5335->3135|5365->3156|5404->3157|5450->3172|5849->3633|5886->3643|5914->3650|5950->3659|6122->3804|6137->3810|6198->3850
                  LINES: 33->7|38->7|39->8|43->12|44->13|44->13|44->13|52->21|52->21|53->22|55->24|55->24|57->26|59->28|59->28|60->29|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|75->44|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|114->84|115->85|115->85|116->86|119->89|119->89|119->89
                  -- GENERATED --
              */
          

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

object getinvolved extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- Luqman -->
"""),_display_(/*3.2*/main("Getinvolved")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<style>
  footer """),format.raw/*5.10*/("""{"""),format.raw/*5.11*/("""

	    """),format.raw/*7.6*/("""position: fixed;
      bottom: 0;
      width: 100%;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""</style>
 
  <div class="container">
			<div class="col-md-4">
			<img src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.versioned("images/s2000banner.jpg")),format.raw/*14.64*/("""" WIDTH="1000"/>
			</div>
			</div>
            <div class="col-md-4">
				<p class="text-justify"><h1><img src=""""),_display_(/*18.44*/routes/*18.50*/.Assets.versioned("images/map.PNG")),format.raw/*18.85*/("""" class="img-responsive" alt="Thats us!"/>Car meets</h1>
				<p>Come and meet other car enthusiasts at one of our monthly meet ups.</p>
			</div>
			
			<div class="col-md-4">	
				<p class="text-justify"><h1><img src=""""),_display_(/*23.44*/routes/*23.50*/.Assets.versioned("images/organise.jpg")),format.raw/*23.90*/(""""  HEIGHT="420" WIDTH="420" class="img-responsive"/>Organise a meet up</h1>
				<p>If you wish to organise a local car meet and promote it, you can do so here.</p>
				<FORM ACTION="HandleForm.php"> 
				<INPUT TYPE=Text NAME= "FirstName" value="John" SIZE=20><br>
				<INPUT TYPE=TEXT NAME= "LastName" value="Doe" SIZE=40><BR>
                <INPUT TYPE=TEXT NAME="Email" value="Your Email" SIZE=60>
				<TEXTAREA NAME="Comments" ROWS=5 COLS=40></TEXTAREA><BR>
                <INPUT TYPE=SUBMIT NAME="SUBMIT" VALUE="Submit!">
				</FORM>
				
			</div>
			
			<div class="col-md-4">
				<p class="text-justify"><h1><img src=""""),_display_(/*36.44*/routes/*36.50*/.Assets.versioned("images/promote.png")),format.raw/*36.89*/(""""  HEIGHT="320" WIDTH="300" class="img-responsive"/>Businesses</h1>
				<p>Advertise your products for hunderds of people to see or sponser a meet up.</p>
			</div>
""")))}),format.raw/*39.2*/("""
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
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/getinvolved.scala.html
                  HASH: 85a7cb97e7ba0f8f349e62e5bc245579f4a1ed25
                  MATRIX: 947->1|1043->3|1070->4|1112->21|1139->40|1178->42|1207->45|1251->62|1279->63|1312->70|1400->131|1429->132|1533->209|1548->215|1612->258|1754->373|1769->379|1825->414|2072->634|2087->640|2148->680|2804->1309|2819->1315|2879->1354|3075->1520
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|37->5|37->5|39->7|42->10|42->10|46->14|46->14|46->14|50->18|50->18|50->18|55->23|55->23|55->23|68->36|68->36|68->36|71->39
                  -- GENERATED --
              */
          
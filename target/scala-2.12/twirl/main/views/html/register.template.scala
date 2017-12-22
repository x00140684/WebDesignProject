
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- Dawid Reszka -->
"""),_display_(/*3.2*/main("Register")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<style>
    
	
    footer """),format.raw/*7.12*/("""{"""),format.raw/*7.13*/("""

	"""),format.raw/*9.2*/("""position: fixed;
   
    bottom: 0;
    width: 100%;
      
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
	
			"""),format.raw/*16.4*/("""h2 """),format.raw/*16.7*/("""{"""),format.raw/*16.8*/("""
		"""),format.raw/*17.3*/("""text-align: center;
		background-color:#f2f2f2;
		margin: auto;
		padding: 30px;
		color: #636363;
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""
       """),format.raw/*23.8*/("""/* Full-width input fields */
input[type=text], input[type=password] """),format.raw/*24.40*/("""{"""),format.raw/*24.41*/("""
    """),format.raw/*25.5*/("""width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""/* Set a style for all buttons */
button """),format.raw/*34.8*/("""{"""),format.raw/*34.9*/("""
    """),format.raw/*35.5*/("""background-color: #5b9aff;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/("""/* Extra styles for the cancel button */
.cancelbtn """),format.raw/*45.12*/("""{"""),format.raw/*45.13*/("""
    """),format.raw/*46.5*/("""padding: 14px 20px;
    background-color: #f44336;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn """),format.raw/*51.23*/("""{"""),format.raw/*51.24*/("""
    """),format.raw/*52.5*/("""float: left;
    width: 100%;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""/* Add padding to container elements */
.container """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
    """),format.raw/*58.5*/("""padding: 16px;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""/* Clear floats */
.clearfix::after """),format.raw/*62.18*/("""{"""),format.raw/*62.19*/("""
    """),format.raw/*63.5*/("""content: "";
    clear: both;
    display: table;
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/("""

"""),format.raw/*68.1*/("""/* Change styles for cancel button and signup button on extra small screens */

	.dropdown-menu """),format.raw/*70.17*/("""{"""),format.raw/*70.18*/("""
	"""),format.raw/*71.2*/("""border-bottom:3px;
	border-bottom-color:#5b9aff;
	border-bottom-style: solid;
	color:light-gray;
	"""),format.raw/*75.2*/("""}"""),format.raw/*75.3*/("""</style>
    <h2>Signup</h2>
    
    <form action="/register" style="border:1px solid #ccc">
      <div class="container">
        <label><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>
    
        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>
    
        <label><b>Repeat Password</b></label>
        <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
        <input type="checkbox" checked="checked"> Remember me
        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    
        <div class="clearfix">
          
          <button type="submit" class="signupbtn">Sign Up</button>
          <button type="button" class="cancelbtn">Cancel</button>
        </div>
      </div>
    </form>
""")))}),format.raw/*98.2*/("""
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
                  DATE: Fri Dec 22 23:05:40 GMT 2017
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/register.scala.html
                  HASH: 196fa9eb52fa209b6ad6dbd2298a5319e5a6adb1
                  MATRIX: 944->1|1040->3|1067->4|1115->27|1139->43|1178->45|1209->50|1262->76|1290->77|1319->80|1410->144|1438->145|1471->151|1501->154|1529->155|1559->158|1687->259|1715->260|1750->268|1847->337|1876->338|1908->343|2074->482|2102->483|2131->485|2199->526|2227->527|2259->532|2430->676|2458->677|2487->679|2567->731|2596->732|2628->737|2706->788|2734->789|2763->791|2874->874|2903->875|2935->880|2992->910|3020->911|3049->913|3128->964|3157->965|3189->970|3231->985|3259->986|3288->988|3352->1024|3381->1025|3413->1030|3490->1080|3518->1081|3547->1083|3671->1179|3700->1180|3729->1182|3854->1280|3882->1281|4784->2153
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|39->7|39->7|41->9|46->14|46->14|48->16|48->16|48->16|49->17|54->22|54->22|55->23|56->24|56->24|57->25|63->31|63->31|65->33|66->34|66->34|67->35|74->42|74->42|76->44|77->45|77->45|78->46|80->48|80->48|82->50|83->51|83->51|84->52|86->54|86->54|88->56|89->57|89->57|90->58|91->59|91->59|93->61|94->62|94->62|95->63|98->66|98->66|100->68|102->70|102->70|103->71|107->75|107->75|130->98
                  -- GENERATED --
              */
          
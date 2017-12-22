
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Contact")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.3*/("""<style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar """),format.raw/*6.13*/("""{"""),format.raw/*6.14*/("""
      """),format.raw/*7.7*/("""margin-bottom: 0;
      border-radius: 0;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
"""),format.raw/*10.1*/("""hr """),format.raw/*10.4*/("""{"""),format.raw/*10.5*/(""" 
    """),format.raw/*11.5*/("""display: block;
    margin-top: 0.5em;
    margin-bottom: 0.5em;
    margin-left: auto;
    margin-right: auto;
    border-style: inset;
    border-width: 1px;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/(""" 
    
    """),format.raw/*20.5*/("""/* Add a gray background color and some padding to the footer */
      footer """),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""
      """),format.raw/*22.7*/("""background-color: #232323;
      padding: 10px;
	  margin-top: 100px;
	  border-top: 3px;
	  border-top-color:#5b9aff;
	  border-top-style:solid;
	  color: #f2f2f2;
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""
	
	"""),format.raw/*31.2*/(""".row """),format.raw/*31.7*/("""{"""),format.raw/*31.8*/("""
	"""),format.raw/*32.2*/("""background-color:#f2f2f2;
	margin-bottom: 10px;
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/("""
		"""),format.raw/*35.3*/(""".dropdown-menu """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
	"""),format.raw/*36.2*/("""border-bottom:3px;
	border-bottom-color:#5b9aff;
	border-bottom-style: solid;
	color:light-gray;
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/("""
	"""),format.raw/*41.2*/("""input[type=text], select, textarea """),format.raw/*41.37*/("""{"""),format.raw/*41.38*/("""
    """),format.raw/*42.5*/("""width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

"""),format.raw/*52.1*/("""input[type=submit] """),format.raw/*52.20*/("""{"""),format.raw/*52.21*/("""
    """),format.raw/*53.5*/("""background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""input[type=submit]:hover """),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
    """),format.raw/*62.5*/("""background-color: #45a049;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/(""".container """),format.raw/*65.12*/("""{"""),format.raw/*65.13*/("""
    """),format.raw/*66.5*/("""border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""
  """),format.raw/*70.3*/("""</style>
  <!-- PAGE CONTENT BY DAWID RESZKA X00140684 !-->
<div class="row">
  <div class="col-sm-12" style="text-align:center; margin-bottom:2em;">
        
          <img src=""""),_display_(/*75.22*/routes/*75.28*/.Assets.versioned("images/meet.jpg")),format.raw/*75.64*/("""" alt="Los Angeles" style="width:100%; border-bottom: 3px; border-bottom-style: solid;
      border-bottom-color:#5b9aff;" >
  
  </div>
  <div class="info" style="border:1px solid #ccc; text-align:center;">
  <h1>Welcome to Gear Foot - Contact Us</h1>
  <p>The Contact Us page is where you can Message, Tweet , Email or Use our Query Form to create a inquery that you have about our website</p>
  </br>
  
  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-4" style="border-right:1px solid #ccc;"><a href="www.facebook.com"> <img src=""""),_display_(/*86.105*/routes/*86.111*/.Assets.versioned("images/f.png")),format.raw/*86.144*/("""" alt="Face" style="width:90%;height: 300px;"></div>
      <div class="col-sm-4"> <a href="www.gmail.com"><a href="www.twitter.com"><img src=""""),_display_(/*87.91*/routes/*87.97*/.Assets.versioned("images/g.png")),format.raw/*87.130*/("""" alt="email" style="width:90%;height: 300px;"></div>
      <div class="col-sm-4" style="border-left:1px solid #ccc; text-align:center;"><a href="www.twitter.com"> <img src=""""),_display_(/*88.122*/routes/*88.128*/.Assets.versioned("images/t.png")),format.raw/*88.161*/("""" alt="tweet" style="width:90%;height: 300px;"></div>
    </div>
  </div>
  <hr>
  <h3>Query Form</h3>
  
  <div class="container">
    <form action="/contact">
      <label for="fname">First Name</label>
      <input type="text" id="fname" name="firstname" placeholder="Your name..">
  
      <label for="lname">Last Name</label>
      <input type="text" id="lname" name="lastname" placeholder="Your last name..">
  
      <label for="country">Country</label>
      <select id="country" name="country">
        <option value="australia">Australia</option>
        <option value="canada">Canada</option>
        <option value="usa">USA</option>
      </select>
  
      <label for="subject">Subject</label>
      <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
  
      <input type="submit" value="Submit">
    </form>
  </div>
  <hr>
""")))}),format.raw/*116.2*/("""
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
                  DATE: Fri Dec 22 23:05:10 GMT 2017
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/contact.scala.html
                  HASH: 5a6df3ba5b3f4a15d58547a4a19d4f80f1cf2204
                  MATRIX: 943->1|1039->3|1067->6|1090->21|1129->23|1158->26|1278->119|1306->120|1339->127|1411->173|1438->174|1466->175|1496->178|1524->179|1557->185|1744->345|1772->346|1810->357|1916->435|1945->436|1979->443|2175->612|2203->613|2234->617|2266->622|2294->623|2323->625|2399->674|2427->675|2457->678|2500->693|2529->694|2558->696|2683->794|2711->795|2740->797|2803->832|2832->833|2864->838|3071->1018|3099->1019|3128->1021|3175->1040|3204->1041|3236->1046|3395->1178|3423->1179|3452->1181|3505->1206|3534->1207|3566->1212|3620->1239|3648->1240|3677->1242|3716->1253|3745->1254|3777->1259|3874->1329|3902->1330|3932->1333|4139->1513|4154->1519|4211->1555|4804->2120|4820->2126|4875->2159|5045->2302|5060->2308|5115->2341|5318->2516|5334->2522|5389->2555|6311->3446
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|39->7|41->9|41->9|42->10|42->10|42->10|43->11|50->18|50->18|52->20|53->21|53->21|54->22|61->29|61->29|63->31|63->31|63->31|64->32|66->34|66->34|67->35|67->35|67->35|68->36|72->40|72->40|73->41|73->41|73->41|74->42|82->50|82->50|84->52|84->52|84->52|85->53|91->59|91->59|93->61|93->61|93->61|94->62|95->63|95->63|97->65|97->65|97->65|98->66|101->69|101->69|102->70|107->75|107->75|107->75|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|148->116
                  -- GENERATED --
              */
          
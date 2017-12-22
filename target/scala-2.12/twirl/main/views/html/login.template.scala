
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- Dawid Reszka -->

"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
  """),format.raw/*5.3*/("""<style>
  form """),format.raw/*6.8*/("""{"""),format.raw/*6.9*/("""
            
			"""),format.raw/*8.4*/("""background-color:#f2f2f2;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
		

       
        """),format.raw/*13.9*/("""input[type=text],
        input[type=password] """),format.raw/*14.30*/("""{"""),format.raw/*14.31*/("""
            """),format.raw/*15.13*/("""width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""footer """),format.raw/*22.16*/("""{"""),format.raw/*22.17*/("""

	    """),format.raw/*24.6*/("""position: fixed;
      bottom: 0;
      width: 100%;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
       
        """),format.raw/*29.9*/("""button """),format.raw/*29.16*/("""{"""),format.raw/*29.17*/("""
            """),format.raw/*30.13*/("""background-color: #5b9aff;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
	
       
        """),format.raw/*40.9*/(""".cancelbtn """),format.raw/*40.20*/("""{"""),format.raw/*40.21*/("""
            """),format.raw/*41.13*/("""width: 100%;
            padding: 10px 18px;
            background-color: #f44336;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""
		"""),format.raw/*45.3*/("""h2 """),format.raw/*45.6*/("""{"""),format.raw/*45.7*/("""
		"""),format.raw/*46.3*/("""text-align: center;
		background-color:#f2f2f2;
		margin: auto;
		padding: 30px;
		color: #636363;
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
       
	   
        """),format.raw/*54.9*/(""".container """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""
            """),format.raw/*55.13*/("""padding: 16px;
			color:black;
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
       
        """),format.raw/*59.9*/("""span.psw """),format.raw/*59.18*/("""{"""),format.raw/*59.19*/("""
            """),format.raw/*60.13*/("""float: right;
            padding-top: 16px;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
        """),format.raw/*63.9*/(""".dropdown-menu """),format.raw/*63.24*/("""{"""),format.raw/*63.25*/("""
	"""),format.raw/*64.2*/("""border-bottom:3px;
	border-bottom-color:#5b9aff;
	border-bottom-style: solid;
	color:light-gray;
	"""),format.raw/*68.2*/("""}"""),format.raw/*68.3*/("""
        """),format.raw/*69.9*/("""/* Change styles for span and cancel button on extra small screens */
       </style>
  <h2>Login</h2>
  <form action="/login" style="border:1px solid #ccc">
      <div class="container">
          <label><b>Username</b></label>
          <input type="text" placeholder="Enter Username" name="uname" required>

          <label><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" required>

          <button type="submit">Login</button>
          <input type="checkbox" checked="checked"> Remember me
      </div>

      <div class="container">
          <button type="button" class="cancelbtn">Cancel</button>
          <span class="psw">Forgot <a href="#">password?</a></span>
      </div>
""")))}),format.raw/*88.2*/("""
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
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/login.scala.html
                  HASH: b9ceed2d5fdff3dedd09bc8222b6405e56c6be48
                  MATRIX: 1030->1|1079->25|1100->38|1139->40|1168->43|1209->58|1236->59|1279->76|1339->110|1367->111|1415->132|1490->179|1519->180|1560->193|1774->380|1803->381|1839->390|1874->397|1903->398|1937->405|2025->466|2054->467|2098->484|2133->491|2162->492|2203->505|2430->705|2459->706|2505->725|2544->736|2573->737|2614->750|2733->842|2762->843|2792->846|2822->849|2850->850|2880->853|3008->954|3036->955|3085->977|3124->988|3153->989|3194->1002|3260->1041|3289->1042|3333->1059|3370->1068|3399->1069|3440->1082|3520->1135|3549->1136|3585->1145|3628->1160|3657->1161|3686->1163|3811->1261|3839->1262|3875->1271|4644->2010
                  LINES: 33->2|35->4|35->4|35->4|36->5|37->6|37->6|39->8|40->9|40->9|44->13|45->14|45->14|46->15|52->21|52->21|53->22|53->22|53->22|55->24|58->27|58->27|60->29|60->29|60->29|61->30|68->37|68->37|71->40|71->40|71->40|72->41|75->44|75->44|76->45|76->45|76->45|77->46|82->51|82->51|85->54|85->54|85->54|86->55|88->57|88->57|90->59|90->59|90->59|91->60|93->62|93->62|94->63|94->63|94->63|95->64|99->68|99->68|100->69|119->88
                  -- GENERATED --
              */
          
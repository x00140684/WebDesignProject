
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

object parts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- Justinas Zevelskis -->
"""),_display_(/*3.2*/main("Parts")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<style>
      /* Remove the navbar's default margin-bottom and rounded borders */ 
      
    h4"""),format.raw/*7.7*/("""{"""),format.raw/*7.8*/("""
        """),format.raw/*8.9*/("""font-weight: 600;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""p"""),format.raw/*10.6*/("""{"""),format.raw/*10.7*/("""
      """),format.raw/*11.7*/("""font-size: 12px;
      margin-top: 5px;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
    """),format.raw/*14.5*/(""".price"""),format.raw/*14.11*/("""{"""),format.raw/*14.12*/("""
      """),format.raw/*15.7*/("""font-size: 30px;
        margin: 0 auto;
        color: #333;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""
    """),format.raw/*19.5*/(""".right"""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""
      """),format.raw/*20.7*/("""float:right;
      border-bottom: 2px solid #232323;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""
    """),format.raw/*23.5*/(""".thumbnail"""),format.raw/*23.15*/("""{"""),format.raw/*23.16*/("""
      """),format.raw/*24.7*/("""opacity:0.70;
      -webkit-transition: all 0.5s; 
      transition: all 0.5s;
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    """),format.raw/*28.5*/(""".thumbnail:hover"""),format.raw/*28.21*/("""{"""),format.raw/*28.22*/("""
      """),format.raw/*29.7*/("""opacity:1.00;
      box-shadow: 0px 0px 10px #4bc6ff;
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""
    """),format.raw/*32.5*/(""".line"""),format.raw/*32.10*/("""{"""),format.raw/*32.11*/("""
      """),format.raw/*33.7*/("""margin-bottom: 5px;
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""
    
    
    """),format.raw/*37.5*/(""".custom-search-form"""),format.raw/*37.24*/("""{"""),format.raw/*37.25*/("""
      """),format.raw/*38.7*/("""margin-top:5px;
  """),format.raw/*39.3*/("""}"""),format.raw/*39.4*/("""
  
    """),format.raw/*41.5*/("""</style>
  <!-- Page Content -->
  <div class="container">
	
		  <div class="row">
	
			<div class="col-lg-3">
	
			  <h1 class="my-4">Shop for Parts</h1>
			  <div class="list-group">
				<a href="#" class="list-group-item">New</a>
				<a href="#" class="list-group-item">Used</a>
				
			  </div>
			  <div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="input-group custom-search-form">
				  <input type="text" class="form-control">
				  <span class="input-group-btn">
				  <button class="btn btn-primary" type="button">
				  <span class="glyphicon glyphicon-search"></span>
				 </button>
				 </span>
				 </div><!-- /input-group -->
			</div>
		</div>
	</div>
	
			</div>
			<!-- /.col-lg-3 -->
	
			<div class="col-lg-9">
	
			  <div class="container">
		<div class="row">
			<!-- BEGIN PRODUCTS -->
			<!-- Dawid filled in the details and pictures for the product columns below!-->
			  <div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("images/part1.jpg")),format.raw/*81.62*/("""" alt="...">
					  <h4>Aux Fan Motor</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>Brand New Aux Fan Motor. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$100</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			<div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*105.19*/routes/*105.25*/.Assets.versioned("images/part2.jpg")),format.raw/*105.62*/(""""  alt="...">
					  <h4>Product Tittle</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>Item Bundle. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$50</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			<div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*129.19*/routes/*129.25*/.Assets.versioned("images/part3.jpg")),format.raw/*129.62*/(""""  alt="...">
					  <h4>Fuel Injector Kit</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
					</div>
					  <p>Brand new fuel injector kit. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$225</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			<div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*153.19*/routes/*153.25*/.Assets.versioned("images/part4.jpg")),format.raw/*153.62*/(""""  alt="...">
					  <h4>Aircon Auxfan Motor</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>Brand new aircon auxfan motor. Contact seller for further info </p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$300</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			<div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*177.19*/routes/*177.25*/.Assets.versioned("images/part5.jpg")),format.raw/*177.62*/(""""  alt="...">
					  <h4>Aircon Compressor</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>Brand new aircon compressor. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$115</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			  <div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*201.19*/routes/*201.25*/.Assets.versioned("images/rsz_gt.jpg")),format.raw/*201.63*/(""""  alt="...">
					  <h4>GT Spoiler</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>GT spoiler in great condition. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$150</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			  <div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*225.19*/routes/*225.25*/.Assets.versioned("images/rsz_1ssr.png")),format.raw/*225.65*/(""""  alt="...">
					  <h4>SSR Rims</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>x4 SSR Rims. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$750</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			
			  <div class="col-md-3 col-sm-6">
				<span class="thumbnail">
					  <img src=""""),_display_(/*250.19*/routes/*250.25*/.Assets.versioned("images/rsz_toyo.jpg")),format.raw/*250.65*/("""" alt="...">
					  <h4>Toyo Tires</h4>
					  <div class="ratings">
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star"></span>
						<span class="glyphicon glyphicon-star-empty"></span>
					</div>
					  <p>x4 Toyo Tires, brande new. Contact seller for further info</p>
					  <hr class="line">
					  <div class="row">
						  <div class="col-md-6 col-sm-6">
							  <p class="price">$200</p>
						  </div>
						  <div class="col-md-6 col-sm-6">
							  <button class="btn btn-primary right" > BUY ITEM</button>
						  </div>
						  
					  </div>
				</span>
			  </div>
			  <!-- END PRODUCTS -->
		</div>
	</div>
	
			</div>
			<!-- /.col-lg-9 -->
	
		  </div>
		  <!-- /.row -->
	
		</div>
    <!-- /.container -->
""")))}),format.raw/*284.2*/("""
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
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/parts.scala.html
                  HASH: 82f754127e992c4d66039e6801d11de5a52765bc
                  MATRIX: 941->1|1037->3|1064->4|1118->33|1139->46|1178->48|1207->51|1329->147|1356->148|1391->157|1439->179|1466->180|1498->185|1526->186|1554->187|1588->194|1659->238|1687->239|1719->244|1753->250|1782->251|1816->258|1909->324|1937->325|1969->330|2003->336|2032->337|2066->344|2150->401|2178->402|2210->407|2248->417|2277->418|2311->425|2421->508|2449->509|2481->514|2525->530|2554->531|2588->538|2673->596|2701->597|2733->602|2766->607|2795->608|2829->615|2880->639|2908->640|2950->655|2997->674|3026->675|3060->682|3105->700|3133->701|3168->709|4206->1720|4221->1726|4279->1763|5124->2580|5140->2586|5199->2623|6033->3429|6049->3435|6108->3472|6956->4292|6972->4298|7031->4335|7902->5178|7918->5184|7977->5221|8839->6055|8855->6061|8915->6099|9772->6928|9788->6934|9850->6974|10685->7781|10701->7787|10763->7827|11676->8709
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|39->7|39->7|40->8|41->9|41->9|42->10|42->10|42->10|43->11|45->13|45->13|46->14|46->14|46->14|47->15|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|55->23|55->23|55->23|56->24|59->27|59->27|60->28|60->28|60->28|61->29|63->31|63->31|64->32|64->32|64->32|65->33|66->34|66->34|69->37|69->37|69->37|70->38|71->39|71->39|73->41|113->81|113->81|113->81|137->105|137->105|137->105|161->129|161->129|161->129|185->153|185->153|185->153|209->177|209->177|209->177|233->201|233->201|233->201|257->225|257->225|257->225|282->250|282->250|282->250|316->284
                  -- GENERATED --
              */
          

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

object cars extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- Justinas Zevelskis -->
"""),_display_(/*3.2*/main("Cars")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<style>
      /* Remove the navbar's default margin-bottom and rounded borders */ 
      h4"""),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""
        """),format.raw/*7.9*/("""font-weight: 600;
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""p"""),format.raw/*9.6*/("""{"""),format.raw/*9.7*/("""
      """),format.raw/*10.7*/("""font-size: 12px;
      margin-top: 5px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/(""".price"""),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
      """),format.raw/*14.7*/("""font-size: 30px;
        margin: 0 auto;
        color: #333;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
    """),format.raw/*18.5*/(""".right"""),format.raw/*18.11*/("""{"""),format.raw/*18.12*/("""
      """),format.raw/*19.7*/("""float:right;
      border-bottom: 2px solid #232323;
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""
    """),format.raw/*22.5*/(""".thumbnail"""),format.raw/*22.15*/("""{"""),format.raw/*22.16*/("""
      """),format.raw/*23.7*/("""opacity:0.70;
      -webkit-transition: all 0.5s; 
      transition: all 0.5s;
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""
    """),format.raw/*27.5*/(""".thumbnail:hover"""),format.raw/*27.21*/("""{"""),format.raw/*27.22*/("""
      """),format.raw/*28.7*/("""opacity:1.00;
      box-shadow: 0px 0px 10px #4bc6ff;
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""
    """),format.raw/*31.5*/(""".line"""),format.raw/*31.10*/("""{"""),format.raw/*31.11*/("""
      """),format.raw/*32.7*/("""margin-bottom: 5px;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
    
    
    """),format.raw/*36.5*/(""".custom-search-form"""),format.raw/*36.24*/("""{"""),format.raw/*36.25*/("""
      """),format.raw/*37.7*/("""margin-top:5px;
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""
  
  
    """),format.raw/*41.5*/("""</style>
  <!-- Page Content -->
  <div class="container">
    
          <div class="row">
    
            <div class="col-lg-3">
    
              <h1 class="my-4">Shop for Cars</h1>
              <div class="list-group">
                <a href="#" class="list-group-item">New</a>
                <a href="#" class="list-group-item">Old</a>
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
                <img src=""""),_display_(/*80.28*/routes/*80.34*/.Assets.versioned("images/careera.jpg")),format.raw/*80.73*/("""" alt="..." >
                <h4>2004 Careera GT</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                <ul>
            <li>Make: Porsche</li>
            <li>Model: Careera GT</li>
            <li>Year: 2004</li>
            <li>Engine: 3.5L Diesel | 650HP</li>
            </ul>
            <p>Low Milage 2004 Careera GT great previous owners good condition</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$50,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
        <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*110.28*/routes/*110.34*/.Assets.versioned("images/rsz_wrx.jpg")),format.raw/*110.73*/("""" alt="...">
                <h4>2008 Subaru Impreza</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
              <span class="glyphicon glyphicon-star"></span>
              <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                            <ul>
            <li>Make: Subaru</li>
            <li>Model: Impreza</li>
            <li>Year: 2008</li>
            <li>Engine: 3.0L Diesel | 325HP</li>
            </ul>
            <p>Subaru Impreza WRX Hatchback model great condition. Very low milage</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$12,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
        <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*140.28*/routes/*140.34*/.Assets.versioned("images/car5.jpg")),format.raw/*140.70*/("""" alt="...">
                <h4>2008 Honda NSX</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                                        <ul>
            <li>Make: Honda</li>
            <li>Model: NSX</li>
            <li>Year: 2008</li>
            <li>Engine: 3.0L Diesel | 540HP</li>
            </ul>
            <p>Honda NSX low milage modification list. Car is in standart condition and running completely stock engine</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$80,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
        <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*170.28*/routes/*170.34*/.Assets.versioned("images/car5.jpg")),format.raw/*170.70*/("""" alt="...">
                <h4>2011 Mercedes AMG</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                             <ul>
            <li>Make: Mercedes</li>
            <li>Model: AMG</li>
            <li>Year: 2011</li>
            <li>Engine: 3.0L Diesel | 525HP</li>
            </ul>
            <p>Luxurious Mercedes Benz AMG, great condition previous owner history and modification list</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$35,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
        
          <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*201.28*/routes/*201.34*/.Assets.versioned("images/car6.jpg")),format.raw/*201.70*/("""" alt="...">
                <h4>2015 Tesla Model S</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                                        <ul>
            <li>Make: Tesla</li>
            <li>Model: Model S</li>
            <li>Year: 2015</li>
            <li>Engine: Full Electric</li>
            </ul>
            <p>Almost brand new Tesla Model S. Previous owner abondoned car to sell ASAP. Overall good condition</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$50,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
          <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*231.28*/routes/*231.34*/.Assets.versioned("images/car7.jpg")),format.raw/*231.70*/("""" alt="...">
                <h4>1999 Nissan Silvia</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                                        <ul>
            <li>Make: Nissan</li>
            <li>Model: Silvia</li>
            <li>Year: 1999</li>
            <li>Engine: 2.0L Petrol | 325HP</li>
            </ul>
            <p>Heavily Modified Nissan Silvia. This is a drift build with highly modified engine and other. Contact seller for details</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$40,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
          <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*261.28*/routes/*261.34*/.Assets.versioned("images/rsz_silvia.jpg")),format.raw/*261.76*/("""" alt="...">
                <h4>2000 Nissan Silvia</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                                        <ul>
            <li>Make: Nissan</li>
            <li>Model: Silvia</li>
            <li>Year: 2000</li>
            <li>Engine: 2.0L Petrol | 325HP</li>
            </ul>
            <p>Highly modified Silvia in the purpose of a show car. Complete original Rocket Bunny KIT. Contact seller for further info</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$25,000</p>
                  </div>
                  <div class="col-md-6 col-sm-6">
                    <button class="btn btn-primary right" > BUY ITEM</button>
                  </div>
                  
                </div>
            </span>
          </div>
        <div class="col-md-3 col-sm-6">
            <span class="thumbnail">
                <img src=""""),_display_(/*291.28*/routes/*291.34*/.Assets.versioned("images/rsz_240sx.jpg")),format.raw/*291.75*/("""" alt="...">
                <h4>1998 Nissan 240sx</h4>
                <div class="ratings">
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star"></span>
                        <span class="glyphicon glyphicon-star-empty"></span>
                    </div>
                                                    <ul>
            <li>Make: Nissan</li>
            <li>Model: 240sx</li>
            <li>Year: 1998</li>
            <li>Engine: 2.0L Petrol | 325HP</li>
            </ul>
            <p>Well taken care of 240sx Nissan completed with many aftermarket price. Please contact the seller for further info</p>
                <hr class="line">
                <div class="row">
                  <div class="col-md-6 col-sm-6">
                    <p class="price">$10,000</p>
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
""")))}),format.raw/*331.2*/("""
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
                  SOURCE: /media/sf_student/WebDesignProject/part-1c/app/views/cars.scala.html
                  HASH: dd8326c271151f320fd9e32e11c01d663614b542
                  MATRIX: 940->1|1036->3|1063->4|1117->33|1137->45|1176->47|1205->50|1322->141|1350->142|1385->151|1433->173|1460->174|1491->179|1518->180|1545->181|1579->188|1650->232|1678->233|1710->238|1744->244|1773->245|1807->252|1900->318|1928->319|1960->324|1994->330|2023->331|2057->338|2141->395|2169->396|2201->401|2239->411|2268->412|2302->419|2412->502|2440->503|2472->508|2516->524|2545->525|2579->532|2664->590|2692->591|2724->596|2757->601|2786->602|2820->609|2871->633|2899->634|2941->649|2988->668|3017->669|3051->676|3096->694|3124->695|3162->706|4477->1994|4492->2000|4552->2039|5866->3325|5882->3331|5943->3370|7252->4651|7268->4657|7326->4693|8694->6033|8710->6039|8768->6075|10127->7406|10143->7412|10201->7448|11566->8785|11582->8791|11640->8827|13033->10192|13049->10198|13113->10240|14505->11604|14521->11610|14584->11651|16087->13123
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|38->6|38->6|39->7|40->8|40->8|41->9|41->9|41->9|42->10|44->12|44->12|45->13|45->13|45->13|46->14|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|54->22|55->23|58->26|58->26|59->27|59->27|59->27|60->28|62->30|62->30|63->31|63->31|63->31|64->32|65->33|65->33|68->36|68->36|68->36|69->37|70->38|70->38|73->41|112->80|112->80|112->80|142->110|142->110|142->110|172->140|172->140|172->140|202->170|202->170|202->170|233->201|233->201|233->201|263->231|263->231|263->231|293->261|293->261|293->261|323->291|323->291|323->291|363->331
                  -- GENERATED --
              */
          
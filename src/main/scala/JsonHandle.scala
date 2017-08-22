/**
  * Created by chaitu on 4/1/2017.
  */
import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods._

object JsonHandle
{
  def main(args: Array[String]): Unit =
  {
    val s : String ="Mon Jan 20 00:09:03 -0800 2014, {\"cl\":\"js\",\"ua\":\"Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko\",\"ip\":\"69.114.130.151\",\"cc\":\"US\",\"rg\":\"NY\",\"ct\":\"Centereach\",\"pc\":\"11720\",\"mc\":501,\"bf\":\"445b253ac8780b0db19589ab359c85a0a4e99e06\",\"vst\":\"47a22b9d-fff0-484b-a4bc-d148f3d3fac1\",\"lt\":\"Mon Jan 20 03:09:32 -0500 2014\",\"hk\":[\"buddytvcom-sc\",\"modern family\"]}, {\"v\":\"1.1\",\"pv\":\"b1ae6cc2-cd86-4ec6-88ad-8acd0e8f8ab0\",\"r\":\"v3\",\"t\":\"882cfd98\",\"a\":[{\"i\":28,\"u\":\"images.buddytv.com/btv_2_1000032079_1_590_-1_0_/-modern-family--quot.jpg\",\"w\":500,\"h\":333,\"x\":132,\"y\":580,\"lt\":\"none\",\"af\":false}],\"rf\":\"http://crowdignite.craveonline.com/v/427/558514919/0/1/43211171?ltype=0&wtype=0&user_id=db555dfc77e51568ece4384eb547e944&slot=1&referp=559390323\",\"p\":\"www.buddytv.com/slideshows/modern-family/modern-family-quotes-the-kids-say-the-funniest-things-48182.aspx?utm_source=crowdignite.com&utm_medium=referral&utm_campaign=crowdignite.com\",\"fs\":true,\"tr\":0.1,\"ac\":{\"18667\":9,\"18670\":3,\"22617\":6,\"23281\":2,\"23418\":2},\"vp\":{\"ii\":false,\"w\":1079,\"h\":525},\"sc\":{\"w\":1093,\"h\":614,\"d\":1.25},\"pid\":3996,\"vid\":1,\"ss\":\"0.75\"}"
    val s1=s.substring(s.indexOf("{"),s.lastIndexOf("}")+1)
    val s2="["+s1+"]"
    var json = parse(s2)
    println(pretty(json \ "pv").toString.replace("\"",""))





  }
}

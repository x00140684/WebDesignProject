
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/WebDesignProject/part-1c/conf/routes
// @DATE:Fri Dec 22 22:58:05 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

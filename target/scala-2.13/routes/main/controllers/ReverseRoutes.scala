// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:15
    def add(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("b", b)))
    }
  
    // @LINE:16
    def subtract(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subtract/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("b", b)))
    }
  
    // @LINE:17
    def multiply(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("b", b)))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}

package a.b.c.pkg

object EntryPoint {
  def main(args: Array[String]): Unit = {
    println("******** a.b.c.pkg.EntryPoint::main() ********")    
    if(args.length == 2) {
      args.foreach { x => println("Argument: "+x) }
    } else {
      System.err.println("Need exactly 2 arguments: arg1 arg2")
      System.exit(-1)
    }    
    
    val classInstance = new MyStringClass(args(0), args(1))
    println("Are Both Same? "       +classInstance.areBothSame())
    println("Join With Space: "     +classInstance.joinWithSpace())
    println("Join With Comma: "     +classInstance.joinWithComma())
    println("Join With UnderScore: "+classInstance.joinWithUnderScore())
  }
}

class MyStringClass (a1: String, a2: String) {
  private var instVar1: String = a1
  private val instVar2: String = a2
  
  def this() { this(null, null) }
  
  def joinWithSpace(): String = {
    val result = this.instVar1+" "+this.instVar2
    result
  }
  
  
  def joinWithComma(): String = {
    val result = this.instVar1+","+this.instVar2
    result
  }
  
  def joinWithUnderScore(): String = {
    val result = this.instVar1+"_"+this.instVar2
    result
  }

  def areBothSame(): Boolean = {
    (this.instVar1==this.instVar2)
  }
  
}

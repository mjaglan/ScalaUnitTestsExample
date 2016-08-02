package a.b.c.pkg

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyStringClassTest extends FunSuite {
  trait TestSets {
    val null_input = null
    val arg1 = "Mayank"
    val arg2 = "Jaglan"
    val emptyString = ""
    val tickyOne = "null"
  }  
  
  // ********************* METHOD #1 ************************************
  test("Test areBothSame(): null-input, null-input") {
    new TestSets {
      assert((new MyStringClass(null_input,null_input).areBothSame()) === true)
    }
  }
  
  test("Test areBothSame(): not-null-input, null-input") {
    new TestSets {
      assert((new MyStringClass(null_input,arg1).areBothSame()) === false)
    }
  }

  test("Test areBothSame(): null-input, not-null-input") {
    new TestSets {
      assert((new MyStringClass(null_input,arg1).areBothSame()) === false)
    }
  }
  
  test("Test areBothSame(): not-null-input, not-null-input") {
    new TestSets {
      assert((new MyStringClass(arg1,arg2).areBothSame()) === false)
    }
  }

  test("Test areBothSame(): null-input, empty-String") {
    new TestSets {
      assert((new MyStringClass(null_input,emptyString).areBothSame()) === false)
    }
  }
  
  test("Test areBothSame(): empty-String, null-input") {
    new TestSets {
      assert((new MyStringClass(emptyString,null_input).areBothSame()) === false)
    }
  }
  
  test("Test areBothSame(): empty-String, empty-String") {
    new TestSets {
      assert((new MyStringClass(emptyString,emptyString).areBothSame()) === true)
    }
  }
    
  test("Test areBothSame(): not-empty-String, empty-String") {
    new TestSets {
      assert((new MyStringClass(arg1,emptyString).areBothSame()) === false)
    }
  }
  
  test("Test areBothSame(): empty-String, not-empty-String") {
    new TestSets {
      assert((new MyStringClass(emptyString,arg2).areBothSame()) === false)
    }
  }
  
  test("Test areBothSame(): ticky-String, null-input") {
    new TestSets {
      assert((new MyStringClass(tickyOne,null_input).areBothSame()) === false)
    }
  }

    
  // ********************* METHOD #2 ************************************
  test("Test joinWithSpace(): String, String") {
    new TestSets {
      assert((new MyStringClass(arg1,arg2).joinWithSpace()) === "Mayank Jaglan")
    }
  }
  
  test("Test joinWithSpace(): null, String") {
    new TestSets {
      assert((new MyStringClass(null_input,arg2).joinWithSpace()) === "null Jaglan")
    }
  }
  
  test("Test joinWithSpace(): empty-String, String") {
    new TestSets {
      assert((new MyStringClass(emptyString,arg2).joinWithSpace()) === " Jaglan")
    }
  }
  
  test("Test joinWithSpace(): empty-String, null") {
    new TestSets {
      assert((new MyStringClass(emptyString,null_input).joinWithSpace()) === " null")
    }
  }

  
  
  // ********************* METHOD #3 ************************************
  test("Test joinWithComma(): String, String") {
    new TestSets {
      assert((new MyStringClass(arg1,arg2).joinWithComma()) === "Mayank,Jaglan")
    }
  }
  
  test("Test joinWithComma(): null, String") {
    new TestSets {
      assert((new MyStringClass(null_input,arg2).joinWithComma()) === "null,Jaglan")
    }
  }
  
  test("Test joinWithComma(): empty-String, String") {
    new TestSets {
      assert((new MyStringClass(emptyString,arg2).joinWithComma()) === ",Jaglan")
    }
  }
  
  test("Test joinWithComma(): empty-String, null") {
    new TestSets {
      assert((new MyStringClass(emptyString,null_input).joinWithComma()) === ",null")
    }
  }  
  
  
  // ********************* METHOD #4 ************************************
  test("Test joinWithUnderScore(): String, String") {
    new TestSets {
      assert((new MyStringClass(arg1,arg2).joinWithUnderScore()) === "Mayank_Jaglan")
    }
  }
  
  test("Test joinWithUnderScore(): null, String") {
    new TestSets {
      assert((new MyStringClass(null_input,arg2).joinWithUnderScore()) === "null_Jaglan")
    }
  }
  
  test("Test joinWithUnderScore(): empty-String, String") {
    new TestSets {
      assert((new MyStringClass(emptyString,arg2).joinWithUnderScore()) === "_Jaglan")
    }
  }
  
  test("Test joinWithUnderScore(): empty-String, null") {
    new TestSets {
      assert((new MyStringClass(emptyString,null_input).joinWithUnderScore()) === "_null")
    }
  }  
}


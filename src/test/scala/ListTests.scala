import org.scalatest.FunSuite

class ListTests extends FunSuite {

  test("List.tail") {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(2, 3, 4, 5)
    assert(List.tail(list1) === list2)
    assert(List.tail(Nil) === Nil)
    assert(List.tail(List(1)) === Nil)
    assert(List.tail(List.tail(list1)) === List.tail(list2))
  }

  test("List.setHead") {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(-1, 2, 3, 4, 5)
    assert(List.setHead(list1, -1) === list2)
    assert(List.setHead(Nil, 5) === List(5))
  }

  test("List.drop") {
    val list1 = List(1, 2, 3, 4, 5)
    assert(List.drop(Nil, 2) === Nil)
    assert(List.drop(list1, 50) === Nil)
    assert(List.drop(list1, 0) === list1)
    assert(List.drop(list1, 1) === List(2, 3, 4, 5))
    assert(List.drop(list1, 5) === Nil)
    assert(List.drop(list1, 3) === List(4, 5))
    assert(List.drop(list1, -2) === list1)
  }
}

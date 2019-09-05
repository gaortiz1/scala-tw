package my_implicit

/*
un functor es simplemente algo que se puede mapear

[ 2, 4, 6 ].map(x => x + 3)

ese "algo" es simplemente un conjunto de valores dispuestos en alguna forma

"que se puede mapear": significa que puede tomar todos los valores dentro de él, luego, para cada valor, obtiene algo de él (aplicando una funcion)


functor representa un conjunto de cosas (en alguna estructura) que se pueden asignar para obtener un conjunto de cosas nuevas bajo esa misma estructura.

 */
object SimpleFunctor {

  def main(args: Array[String]): Unit = {
    println(inc(List(1, 2, 3)))
  }

  implicit val listFunctor: Functor[List] = new Functor[List] {
    def map[A, B](fa: List[A])(f: A => B): List[B] = fa.map(f)
  }

  def inc(list: List[Int])(implicit func: Functor[List]) = func.map(list)(_ + 1)

  //functor.map(x => f(g(x))) ≡ functor.map(g).map(f)
  trait Functor[F[_]] {
    def map[A, B](fa: F[A])(f: A => B): F[B]
  }


}




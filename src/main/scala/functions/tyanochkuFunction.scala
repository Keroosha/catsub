package functions

import cats.effect.{IO, Resource}
import cats.syntax.all._
import sttp.client3.SttpBackend

import tg.api._

object tyanochkuFunction {
  val tyanki = List(
    "худенькую бледненькую...",
    "девственную нецелованную...",
    "как же хочется..."
  )

  // impure code omegalul
  def pickTyanochka: String = tyanki((Math.random() * tyanki.size).toInt)

  def resource(implicit b: SttpBackend[IO, Any]): Resource[IO, BotFunction] = Resource.pure[IO, BotFunction] { update =>
    update.message.filter(_.text.exists(_.contains("чку бы"))).traverse { m =>
      sendMessage(m.chat.id, m.message_id, pickTyanochka)
    }.map(_.nonEmpty)
  }
}

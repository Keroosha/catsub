import derevo.derive
import derevo.circe._

package object models {
  @derive(codec) case class Chat(id: Long)
  @derive(codec) case class Message(message_id: Long, date: Long, chat: Chat, reply_to_message: Option[Message], text: Option[String], photo: Option[Vector[PhotoSize]])
  @derive(codec) case class Update(update_id: Long, message: Option[Message], edited_message: Option[Message])
  @derive(codec) case class GetUpdatesResponse(result: Vector[Update])
  @derive(codec) case class SendMessageResponse(result: Message)
  @derive(codec) case class PhotoSize(file_id: String, file_unique_id: String, width: Long, height: Long, file_size: Option[Long])
  @derive(codec) case class File(file_id: String, file_unique_id: String, file_size: Option[Long], file_path: Option[String])
}

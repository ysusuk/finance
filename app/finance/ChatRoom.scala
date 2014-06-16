package finance

import akka.actor.Actor

/**
 * Created by iurii.susuk on 16.06.2014.
 */
class ChatRoom extends Actor {

  def receive = {
    case Subscribe(user) =>
    case Unsubscribe(user) =>
    case UserPost(user, post) =>
  }
}

// val chatRoom = new ChatRoom
// chatRoom.start()

case class User(name: String)
case class Subscribe(user: User)
case class Unsubscribe(user: User)
case class Post(msg: String)
case class UserPost(user: User, post: Post)



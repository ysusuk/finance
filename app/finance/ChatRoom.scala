package finance

/**
 * Created by iurii.susuk on 16.06.2014.
 */
class ChatRoom {

}

case class User(name: String)
case class Subscribe(user: User)
case class Unsubscribe(user: User)
case class Post(msg: String)
case class UserPost(user: User, post: Post)
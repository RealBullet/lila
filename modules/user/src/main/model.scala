package lila.user

final class GetBotIds(f: () => Fu[Set[User.ID]]) extends (() => Fu[Set[User.ID]]) {
  def apply() = f()
}

// permission holder
case class Holder(user: User) extends AnyVal {
  def id = user.id
}

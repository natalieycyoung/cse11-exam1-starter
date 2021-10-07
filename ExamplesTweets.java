
class User {
  String name;
  String email;
  int followers;
  User(String name, String email, int followers) {
    this.name = name;
    this.email = email;
    this.followers = followers;
  }
}

class Tweet {
  User author;
  String content;
  String tweetId;
  int likes;
  Tweet(User author, String content, String tweetId, int likes) {
    this.author = author;
    this.content = content;
    this.tweetId = tweetId;
    this.likes = likes;
  }
}

class ExamplesTweets {

}
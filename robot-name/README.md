# Robot Name

Write a program that manages robot factory settings.

When robots come off the factory floor, they have no name.

The first time you boot them up, a random name is generated in the format
of two uppercase letters followed by three digits, such as RX837 or BC811.

Every once in a while we need to reset a robot to its factory settings,
which means that their name gets wiped. The next time you ask, it will
respond with a new random name.

The names must be random: they should not follow a predictable sequence.
Random names means a risk of collisions. Your solution should not allow
the use of the same name twice when avoidable. In some exercism language
tracks there are tests to ensure that the same name is never used twice.

The Scala exercises assume an SBT project scheme. The exercise solution source
should be placed within the exercise directory/src/main/scala. The exercise
unit tests can be found within the exercise directory/src/test/scala.

To run the tests simply run the command `sbt test` in the exercise directory.

For more detailed info about the Scala track see the [help
page](http://exercism.io/languages/scala).


## Hints
Make sure your solution is general enough to be easily scalable for longer names containing more letters and digits. This usually makes for better code quality, too.

Suggestion (this is not explicitly tested):
To make sure you always have a unique name you could implement your own cache or use a `Stream` with its built-in cache.

## Source

A debugging session with Paul Blackwell at gSchool. [http://gschool.it](http://gschool.it)

## Submitting Incomplete Problems
It's possible to submit an incomplete solution so you can see how others have completed the exercise.


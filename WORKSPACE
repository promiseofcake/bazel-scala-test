git_repository(
    name = "io_bazel_rules_scala",
    remote = "https://github.com/bazelbuild/rules_scala.git",
    commit = "7b9b89b70bfd6935ccfc9886105471ba4b733fd1",
)
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

maven_jar(
    name = "org_scala_lang_scala_parser_combinators",
    artifact = "org.scala-lang:scala-parser-combinators:2.11.0-M4",
    sha1 = "25b3a88078544a2b9e11b999e5d689cb73d9c0ea",
)

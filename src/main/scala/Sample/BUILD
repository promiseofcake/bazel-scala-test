load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

package(default_visibility = ["//visibility:public"])

scala_library(
    name = "a",
    srcs = ["A.scala"],
    deps = [],
)

scala_library(
    name = "simple_parser",
    srcs = ["SimpleParser.scala"],
    deps = [
        "@org_scala_lang_scala_parser_combinators//jar"
    ],
)

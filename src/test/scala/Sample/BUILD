load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

package(default_visibility = ["//sample:__subpackages__"])

scala_test(
    name = "atest",
    size = "small",
    srcs = ["ATest.scala"],
    deps = [
        "//src/main/scala/Sample:a"
    ],
)

scala_test(
    name = "simple_parser_test",
    size = "small",
    srcs = ["SimpleParserTest.scala"],
    deps = [
        "//src/main/scala/Sample:simple_parser",
    ],
)

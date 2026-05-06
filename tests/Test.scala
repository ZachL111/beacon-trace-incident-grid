object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(52, 85, 17, 12, 13)
    assert(Policy.score(signalcase_1) == 88)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(74, 96, 25, 11, 6)
    assert(Policy.score(signalcase_2) == 96)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(92, 102, 11, 5, 12)
    assert(Policy.score(signalcase_3) == 248)
    assert(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(78, 40, 16, 65)
    assert(DomainReviewLens.score(domainReview) == 213)
    assert(DomainReviewLens.lane(domainReview) == "ship")
  }
}

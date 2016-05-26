package org.ithsdo.tutorial;

import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * Support for integration tests
 */
public class TestSupport {

  /** The name. */
  @Rule
  public TestName name = new TestName();

}
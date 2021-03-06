package com.toedter.components;

import junit.framework.TestCase;
// JUnitDoclet begin import
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class JSpinFieldTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.toedter.components.JSpinField jspinfield = null;
  // JUnitDoclet end class
  
  public JSpinFieldTest(String name) {
    // JUnitDoclet begin method JSpinFieldTest
    super(name);
    // JUnitDoclet end method JSpinFieldTest
  }
  
  public com.toedter.components.JSpinField createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.toedter.components.JSpinField();
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    jspinfield = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    jspinfield = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  public void testAdjustWidthToMaximumValue() throws Exception {
    // JUnitDoclet begin method adjustWidthToMaximumValue
    // JUnitDoclet end method adjustWidthToMaximumValue
  }
  
  public void testStateChanged() throws Exception {
    // JUnitDoclet begin method stateChanged
    // JUnitDoclet end method stateChanged
  }
  
  public void testSetGetValue() throws Exception {
    // JUnitDoclet begin method setValue getValue
    int[] tests = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    
    for (int i = 0; i < tests.length; i++) {
      jspinfield.setValue(tests[i]);
      assertEquals(tests[i], jspinfield.getValue());
    }
    // JUnitDoclet end method setValue getValue
  }
  
  public void testSetGetMinimum() throws Exception {
    // JUnitDoclet begin method setMinimum getMinimum
    int[] tests = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    
    for (int i = 0; i < tests.length; i++) {
      jspinfield.setMinimum(tests[i]);
      assertEquals(tests[i], jspinfield.getMinimum());
    }
    // JUnitDoclet end method setMinimum getMinimum
  }
  
  public void testSetGetMaximum() throws Exception {
    // JUnitDoclet begin method setMaximum getMaximum
    int[] tests = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    
    for (int i = 0; i < tests.length; i++) {
      jspinfield.setMaximum(tests[i]);
      assertEquals(tests[i], jspinfield.getMaximum());
    }
    // JUnitDoclet end method setMaximum getMaximum
  }
  
  public void testSetHorizontalAlignment() throws Exception {
    // JUnitDoclet begin method setHorizontalAlignment
    // JUnitDoclet end method setHorizontalAlignment
  }
  
  public void testSetFont() throws Exception {
    // JUnitDoclet begin method setFont
    // JUnitDoclet end method setFont
  }
  
  public void testSetForeground() throws Exception {
    // JUnitDoclet begin method setForeground
    // JUnitDoclet end method setForeground
  }
  
  public void testCaretUpdate() throws Exception {
    // JUnitDoclet begin method caretUpdate
    // JUnitDoclet end method caretUpdate
  }
  
  public void testActionPerformed() throws Exception {
    // JUnitDoclet begin method actionPerformed
    // JUnitDoclet end method actionPerformed
  }
  
  public void testSetEnabled() throws Exception {
    // JUnitDoclet begin method setEnabled
    // JUnitDoclet end method setEnabled
  }
  
  public void testGetSpinner() throws Exception {
    // JUnitDoclet begin method getSpinner
    // JUnitDoclet end method getSpinner
  }
  
  public void testMain() throws Exception {
    // JUnitDoclet begin method main
    // JUnitDoclet end method main
  }
  
  public void testFocusGained() throws Exception {
    // JUnitDoclet begin method focusGained
    // JUnitDoclet end method focusGained
  }
  
  public void testFocusLost() throws Exception {
    // JUnitDoclet begin method focusLost
    // JUnitDoclet end method focusLost
  }
  
  
  
  /**
  * JUnitDoclet moves marker to this method, if there is not match
  * for them in the regenerated code and if the marker is not empty.
  * This way, no test gets lost when regenerating after renaming.
  * Method testVault is supposed to be empty.
  */
  public void testVault() throws Exception {
    // JUnitDoclet begin method testcase.testVault
    // JUnitDoclet end method testcase.testVault
  }
  
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(JSpinFieldTest.class);
    // JUnitDoclet end method testcase.main
  }
}

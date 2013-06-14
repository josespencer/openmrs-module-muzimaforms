package org.openmrs.module.html5forms.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.module.html5forms.HTML5Forms;
import org.openmrs.module.html5forms.HTML5XForms;
import org.openmrs.test.BaseModuleContextSensitiveTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HTML5FormsControllerTest extends BaseModuleContextSensitiveTest {
    @Before
    public void setUp() throws Exception {
        executeDataSet("xformomodTestData.xml");

    }

    @Test
    public void testForms() throws Exception {
        HTML5FormsController controller = new HTML5FormsController();
        HTML5Forms forms = controller.forms();
        assertThat(forms.getList().size(), is(3));
    }

}
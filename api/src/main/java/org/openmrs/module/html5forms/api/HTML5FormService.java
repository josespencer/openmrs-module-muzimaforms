package org.openmrs.module.html5forms.api;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.html5forms.HTML5Forms;
import org.openmrs.module.html5forms.HTML5XForm;
import org.openmrs.module.html5forms.HTML5XForms;
import org.springframework.transaction.annotation.Transactional;

public interface HTML5FormService extends OpenmrsService {
    @Transactional(readOnly = true)
    HTML5Forms getAll();

    @Transactional(readOnly = true)
    HTML5XForms getXForms();
}
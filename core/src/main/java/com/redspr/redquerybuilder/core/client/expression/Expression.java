package com.redspr.redquerybuilder.core.client.expression;


import java.util.List;

import com.redspr.redquerybuilder.core.BaseSqlWidget;
import com.redspr.redquerybuilder.core.client.engine.Session;

public class Expression extends BaseSqlWidget {

    public Expression(Session session) {
        super(session);
        // initWidget(new Label("E" + getClass().getName()));
    }

    public String getSQL(List args) {
        return "blah";
    }

}

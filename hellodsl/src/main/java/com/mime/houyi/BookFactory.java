package com.mime.houyi;

import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Project;
import org.gradle.internal.reflect.Instantiator;


/**
 * <p>write the description
 *
 * @author houyi
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */


public class BookFactory implements NamedDomainObjectFactory<Book> {
    private final Instantiator instantiator;
    private final Project project;

    public BookFactory(Instantiator instantiator, Project project) {
        this.instantiator = instantiator;
        this.project = project;
    }

    @Override
    public Book create(String name) {
        return instantiator.newInstance(Book.class,new Object[]{name,instantiator,project});
    }
}

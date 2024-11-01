/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/1
 */
package com.source.reading.mapstruct;


/**
 * 在POM中没有annotationProcessorPaths时，Maven使用的classPath作为注解处理器执行的顺序，而classPath的顺序正是dependencies中导入的顺序。
 * 当MapStruct依赖在Lombok依赖前面时，在执行注解处理器期间， 由于Lombok还未生成get、set代码，因此在MapStruct看来，这些类并没有公开的成员变量，也就无从生成用于转换的方法。
 * 在使用annotationProcessorPaths后，其强制规定了注解处理器的顺序，dependencies中的顺序就被忽略了，Maven一定会先运行Lombok再运行MapStruct，代码即可正常运行。
 */
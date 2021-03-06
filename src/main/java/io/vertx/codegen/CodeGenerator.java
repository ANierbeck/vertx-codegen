package io.vertx.codegen;

import java.io.Serializable;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CodeGenerator {
  public final String name;
  public final String kind;
  public final boolean incremental;
  public final String filename;
  public final String templateFilename;
  Template template;
  Serializable filenameExpr;

  public CodeGenerator(
    String name,
    String kind,
    boolean incremental,
    String filename,
    String templateFilename) {
    this.name = name;
    this.kind = kind;
    this.filename = filename;
    this.templateFilename = templateFilename;
    this.incremental = incremental;
  }
}

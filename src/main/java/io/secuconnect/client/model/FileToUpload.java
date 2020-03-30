package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.File;

/**
 * File to upload
 */
public class FileToUpload {
  @SerializedName("file")
  private File file = null;

  public FileToUpload file(File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileToUpload fileToUpload = (FileToUpload) o;
    return Objects.equals(this.file, fileToUpload.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(file));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileToUpload {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


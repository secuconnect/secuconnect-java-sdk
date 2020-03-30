
package io.secuconnect.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.PostProcessor;
import io.gsonfire.TypeSelector;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

import io.secuconnect.client.model.*;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private DateTimeTypeAdapter dateTimeTypeAdapter = new DateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
          .registerPostProcessor(BaseProductModel.class, new PostProcessor<BaseProductModel>() {
              @Override
              public void postDeserialize(BaseProductModel result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, BaseProductModel src, Gson gson) {
                  Map<Class<? extends BaseProductModel>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(DocumentUploadsBaseProductModel.class, "DocumentUploadsBaseProductModel");
                      discriminatorValueByClass.put(GeneralContractsProductModel.class, "GeneralContractsProductModel");
                      discriminatorValueByClass.put(GeneralMerchantsProductModel.class, "GeneralMerchantsProductModel");
                      discriminatorValueByClass.put(GeneralStoresProductModel.class, "GeneralStoresProductModel");
                      discriminatorValueByClass.put(LoyaltyCardgroupsProductModel.class, "LoyaltyCardgroupsProductModel");
                      discriminatorValueByClass.put(LoyaltyCardsProductModel.class, "LoyaltyCardsProductModel");
                      discriminatorValueByClass.put(LoyaltyCustomersProductModel.class, "LoyaltyCustomersProductModel");
                      discriminatorValueByClass.put(LoyaltyMerchantcardsProductModel.class, "LoyaltyMerchantcardsProductModel");
                      discriminatorValueByClass.put(LoyaltyStoregroupsProductModel.class, "LoyaltyStoregroupsProductModel");
                      discriminatorValueByClass.put(PaymentContainersProductModel.class, "PaymentContainersProductModel");
                      discriminatorValueByClass.put(PaymentContractsProductModel.class, "PaymentContractsProductModel");
                      discriminatorValueByClass.put(PaymentCustomersProductModel.class, "PaymentCustomersProductModel");
                      discriminatorValueByClass.put(PaymentTransactionsProductModel.class, "PaymentTransactionsProductModel");
                      discriminatorValueByClass.put(PrepaidItemsProductModel.class, "PrepaidItemsProductModel");
                      discriminatorValueByClass.put(PrepaidSalesProductModel.class, "PrepaidSalesProductModel");
                      discriminatorValueByClass.put(SecupayPayoutProductModel.class, "SecupayPayoutProductModel");
                      discriminatorValueByClass.put(SecupayTransactionProductModel.class, "SecupayTransactionProductModel");
                      discriminatorValueByClass.put(SmartDevicesProductModel.class, "SmartDevicesProductModel");
                      discriminatorValueByClass.put(SmartRoutingsProductModel.class, "SmartRoutingsProductModel");
                      discriminatorValueByClass.put(SmartTransactionsProductModel.class, "SmartTransactionsProductModel");
                      discriminatorValueByClass.put(BaseProductModel.class, "BaseProductModel");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(DocumentUploadsBaseProductModel.class, new PostProcessor<DocumentUploadsBaseProductModel>() {
              @Override
              public void postDeserialize(DocumentUploadsBaseProductModel result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, DocumentUploadsBaseProductModel src, Gson gson) {
                  Map<Class<? extends DocumentUploadsBaseProductModel>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(DocumentUploadsProductModel.class, "DocumentUploadsProductModel");
                      discriminatorValueByClass.put(DocumentUploadsBaseProductModel.class, "DocumentUploadsBaseProductModel");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(LoyaltyMerchantcardsDTOValidateMerchantCard.class, new PostProcessor<LoyaltyMerchantcardsDTOValidateMerchantCard>() {
              @Override
              public void postDeserialize(LoyaltyMerchantcardsDTOValidateMerchantCard result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, LoyaltyMerchantcardsDTOValidateMerchantCard src, Gson gson) {
                  Map<Class<? extends LoyaltyMerchantcardsDTOValidateMerchantCard>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(LoyaltyMerchantcardsDTONewPasscode.class, "LoyaltyMerchantcardsDTONewPasscode");
                      discriminatorValueByClass.put(LoyaltyMerchantcardsDTOValidateMerchantCard.class, "LoyaltyMerchantcardsDTOValidateMerchantCard");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(LoyaltyMerchantcardsProductModel.class, new PostProcessor<LoyaltyMerchantcardsProductModel>() {
              @Override
              public void postDeserialize(LoyaltyMerchantcardsProductModel result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, LoyaltyMerchantcardsProductModel src, Gson gson) {
                  Map<Class<? extends LoyaltyMerchantcardsProductModel>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(LoyaltyMerchantcardsProductWithReceiptModel.class, "LoyaltyMerchantcardsProductWithReceiptModel");
                      discriminatorValueByClass.put(LoyaltyMerchantcardsProductModel.class, "LoyaltyMerchantcardsProductModel");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(ReceiptType.class, new PostProcessor<ReceiptType>() {
              @Override
              public void postDeserialize(ReceiptType result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, ReceiptType src, Gson gson) {
                  Map<Class<? extends ReceiptType>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(ReceiptTypeValue.class, "ReceiptTypeValue");
                      discriminatorValueByClass.put(ReceiptType.class, "ReceiptType");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(SecupayBaseBasketItem.class, new PostProcessor<SecupayBaseBasketItem>() {
              @Override
              public void postDeserialize(SecupayBaseBasketItem result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, SecupayBaseBasketItem src, Gson gson) {
                  Map<Class<? extends SecupayBaseBasketItem>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(SecupayBasketItem.class, "SecupayBasketItem");
                      discriminatorValueByClass.put(SecupayBaseBasketItem.class, "SecupayBaseBasketItem");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerPostProcessor(SmartTransactionsBaseProduct.class, new PostProcessor<SmartTransactionsBaseProduct>() {
              @Override
              public void postDeserialize(SmartTransactionsBaseProduct result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, SmartTransactionsBaseProduct src, Gson gson) {
                  Map<Class<? extends SmartTransactionsBaseProduct>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(SmartTransactionsBonusProducts.class, "SmartTransactionsBonusProducts");
                      discriminatorValueByClass.put(SmartTransactionsBaseProduct.class, "SmartTransactionsBaseProduct");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
        .registerTypeSelector(OneOfPaymentContainersDTOModelPrivate.class, new TypeSelector<OneOfPaymentContainersDTOModelPrivate>() {
            @Override
            public Class<? extends OneOfPaymentContainersDTOModelPrivate> getClassForElement(JsonElement readElement) {
                if (readElement.getAsJsonObject().has("pan")) {
                    return CreditCardDescriptor.class;
                }
                return BankAccountDescriptor.class;
            }
        })
//          .registerPostProcessor(PaymentContainersProductModel.class, new PostProcessor<PaymentContainersProductModel>() {
//              @Override
//              public void postDeserialize(PaymentContainersProductModel result, JsonElement src, Gson gson) {
//                  if (src.getAsJsonObject().has("type")) {
//                      if ("credit_card".equals(src.getAsJsonObject().get("type").getAsString())) {
//                          result.setPublic(gson.fromJson(src, CreditCardDescriptor.class));
//                          result.setPrivate(gson.fromJson(src, CreditCardDescriptor.class));
//                      } else {
//                          result.setPublic(gson.fromJson(src, BankAccountDescriptor.class));
//                          result.setPrivate(gson.fromJson(src, BankAccountDescriptor.class));
//                      }
//                  }
//              }
//
//              @Override
//              public void postSerialize(JsonElement result, PaymentContainersProductModel src, Gson gson) {
//
//              }
//          })
//          .registerTypeSelector(OneOfPaymentContainersDTOModelPrivate.class, new TypeSelector<OneOfPaymentContainersDTOModelPrivate>() {
//              @Override
//              public Class<? extends OneOfPaymentContainersDTOModelPrivate> getClassForElement(JsonElement readElement) {
//                  Map<String, Class<? extends OneOfPaymentContainersDTOModelPrivate>> classByDiscriminatorValue = new HashMap<>();
//                  classByDiscriminatorValue.put("bank_account".toUpperCase(), BankAccountDescriptor.class);
//                  classByDiscriminatorValue.put("credit_card".toUpperCase(), CreditCardDescriptor.class);
//                  return getClassByDiscriminator(
//                          classByDiscriminatorValue,
//                          getDiscriminatorValue(readElement, "type"));
//              }
//          })
        ;
        return fireBuilder.createGsonBuilder();
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if(null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    private static <T> Class<? extends T> getClassByDiscriminator(Map<String, Class<? extends T>> classByDiscriminatorValue, String discriminatorValue) {
        Class<? extends T> clazz = classByDiscriminatorValue.get(discriminatorValue.toUpperCase());
        if(null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(DateTime.class, dateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class))
                return (T) body;
            else throw (e);
        }
    }

    /**
     * Gson TypeAdapter for Joda DateTime type
     */
    public static class DateTimeTypeAdapter extends TypeAdapter<DateTime> {

        private DateTimeFormatter formatter;

        public DateTimeTypeAdapter() {
            this(new DateTimeFormatterBuilder()
                .append(ISODateTimeFormat.dateTime().getPrinter(), ISODateTimeFormat.dateOptionalTimeParser().getParser())
                .toFormatter());
        }

        public DateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, DateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.print(date));
            }
        }

        @Override
        public DateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return formatter.parseDateTime(date);
            }
        }
    }

    /**
     * Gson TypeAdapter for Joda LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(ISODateTimeFormat.date());
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.print(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return formatter.parseLocalDate(date);
            }
        }
    }

    public JSON setDateTimeFormat(DateTimeFormatter dateFormat) {
        dateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}

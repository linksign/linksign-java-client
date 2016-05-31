package cn.linksign.client.auth;

import java.util.Map;
import java.util.List;

import cn.linksign.client.Pair;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}

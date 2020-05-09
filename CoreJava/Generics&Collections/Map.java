public static boolean hasDuplicateMappings(Map<String, String> map) 
{
	Set<Object> uv = new HashSet<Object>(map.values());	
  if(uv.size()==map.size())
    return false;
  else
    return true;
}
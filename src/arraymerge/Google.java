package arraymerge;

* public class Google {
*     int start;
*     int end;
*     Google() { start = 0; end = 0; }
*     Google(int s, int e) { start = s; end = e; }
* }

//	    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
//
//	     
//	            
//	            if(intervals == null)
//	            {
//	                intervals = new ArrayList<Interval>();
//	                intervals.add(newInterval);
//	                return intervals;
//	            }
//	            else if(intervals.size()==0)
//	            {
//	                  intervals.add(newInterval);
//	                  return intervals;
//	            }
//	         Interval toInsert = newInterval;
//	            
//	        
//	        int i = 0;
//	        
//	        while(i<intervals.size())
//	        {
//	            
//	            Interval current = intervals.get(i);
//	            if(current.end<toInsert.start)
//	            {
//	                i++;
//	                continue;
//	            }
//	            
//	            else if(toInsert.end>current.start)
//	            {
//	                intervals.add(i, toInsert);
//	                    break;
//	            }
//	            else
//	            {
//	    
//	            toInsert.start= Math.min(toInsert.start , current.start);
//	            toInsert.end = Math.max(toInsert.end, current.end);
//	            intervals.remove(i);
//	                
//	            }
//	        }  
//	        
//	      if( i== intervals.size())
//	      {
//	          intervals.add(toInsert);
//	      }
//	      return intervals;
//	    }
//	    
//	    
//	}
        Google current = newInterval;
        int i = 0;
        while(i < intervals.size()){
            Google in = intervals.get(i);
            if(in.end < current.start){
                i++;
            }else if(in.start > current.end){
                intervals.add(i, current);
                break;
            }else{
                current.start = Math.min(in.start, current.start);
                current.end = Math.max(in.end, current.end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()){
            intervals.add(current);
        }
        return intervals;
    }
}
}

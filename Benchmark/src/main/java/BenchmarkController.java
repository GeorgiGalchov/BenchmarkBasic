//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//class BenchmarkController {
//
//    @GetMapping("/")
//    public String benchmark() {
//        long startTime = System.currentTimeMillis();
//        long endTime = startTime + 60000;
//
//        long index = 0;
//
//        while (true) {
//            double x = Math.sqrt(index);
//            long now = System.currentTimeMillis();
//            if (now > endTime) {
//                break;
//            }
//            index++;
//        }
//
//        return index + " Loops In One Minute.";
//    }
//}
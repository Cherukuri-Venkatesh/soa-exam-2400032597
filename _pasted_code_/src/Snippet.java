import java.util.List;

public class Snippet {
	
	 @Autowired
	    private  userservice;
	@PostMapping("/add")
	    public  adduser(@RequestBody User user) {
	        return userservice.adduser(user);
	    }
	
	    @GetMapping("/displayall")
	    public List<User> getallusers() {
	        return userservice.getallusers();
	    }
	    @DeleteMapping("/delete/{id}")
	    public String deleteuserbyid(@PathVariable Long id) {
	        return userservice.deleteuserbyid(id);
	    }
}
@RequestMapping(value = "/getreservations", method = RequestMethod.GET)
public String getReserveBook(@Validated(FormValidationGroup.class) Reserve reserve, Model model, Principal principal) {


        String username = principal.getName();
        reserve.getUser().setUsername(username);

        List<Reserve> reserves = reserveService.getReserves(username);
        model.addAttribute("reserves", reserves);
        System.out.println(reserves);


        return "home";

        }


        }

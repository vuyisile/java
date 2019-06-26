package com.app;

public class SignInController {
}
/*
app.post('/signup', async function (req, res) {
  var details = req.body
  try {
    var check = await ref.checkIfExits(details.email);
    console.log({ check })
    if (check.status === false) {
      await ref.saveCustomer(details);
      res.sendStatus(201).end()
    }
    // res.sendStatus(200)
  } catch (error) {
    console.log('error', error)
    res.sendStatus(500)
  }
})

app.post('/login', async function (req, res) {
  passport.authenticate('local', (err, data, message) => {
    if (data === false) {
      res.status(204).end();
    } else if (err) {
      res.status(204).end();
    }
    req.login(data, () => {
      var userDetails = { userName: data.user.name, email: data.user.email, telephone: data.user.telephone, userType: data.user.role }
      const token = jwt.generateToken(userDetails);
      // console.log('token :', token);
      res.json({ message, token }).status(202).end();
    });
  })(req, res);
})

app.get('/logout', function (req, res) {
  console.log('req.user :', req.user);
  req.logout()
  res.redirect('/')
})

*/
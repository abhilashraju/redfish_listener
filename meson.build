

# Define the executable
project('redfishlistener', 'cpp',default_options: ['c_std=c18','cpp_std=c++23','cpp_args=-Wno-subobject-linkage'])
reactor_dep=dependency('reactor')
boost_dep = dependency('boost', modules: ['url'], required: true)
sdeventplus_dep = dependency('sdeventplus')
openssl_dep = dependency('openssl', required: true)
nlohmann_dep = dependency('nlohmann_json',required: true)
executable('redfishlistener',
  'redfishlistener.cpp',
  dependencies: [reactor_dep,boost_dep,sdeventplus_dep,openssl_dep,nlohmann_dep],
  cpp_args: ['-DBOOST_ASIO_DISABLE_THREADS'],
  install: true,
  install_dir: '/usr/bin'
)
install_data(
    'service/redfishlistener.service',
    install_dir: '/etc/systemd/system',
)
